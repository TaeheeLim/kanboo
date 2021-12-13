package com.kanboo.www.domain.entity.project;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QKanbanItem is a Querydsl query type for KanbanItem
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QKanbanItem extends EntityPathBase<KanbanItem> {

    private static final long serialVersionUID = 18305870L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QKanbanItem kanbanItem = new QKanbanItem("kanbanItem");

    public final QKanban kanban;

    public final StringPath kbBadge = createString("kbBadge");

    public final StringPath kbCn = createString("kbCn");

    public final StringPath kbColor = createString("kbColor");

    public final DateTimePath<java.time.LocalDateTime> kbDate = createDateTime("kbDate", java.time.LocalDateTime.class);

    public final NumberPath<Long> kbItmIdx = createNumber("kbItmIdx", Long.class);

    public final StringPath kbItmNum = createString("kbItmNum");

    public final com.kanboo.www.domain.entity.member.QMember member;

    public QKanbanItem(String variable) {
        this(KanbanItem.class, forVariable(variable), INITS);
    }

    public QKanbanItem(Path<? extends KanbanItem> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QKanbanItem(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QKanbanItem(PathMetadata metadata, PathInits inits) {
        this(KanbanItem.class, metadata, inits);
    }

    public QKanbanItem(Class<? extends KanbanItem> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.kanban = inits.isInitialized("kanban") ? new QKanban(forProperty("kanban"), inits.get("kanban")) : null;
        this.member = inits.isInitialized("member") ? new com.kanboo.www.domain.entity.member.QMember(forProperty("member"), inits.get("member")) : null;
    }

}

