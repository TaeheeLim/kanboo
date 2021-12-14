package com.kanboo.www.domain.entity.project;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QKanban is a Querydsl query type for Kanban
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QKanban extends EntityPathBase<Kanban> {

    private static final long serialVersionUID = 1592306075L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QKanban kanban = new QKanban("kanban");

    public final NumberPath<Long> kbIdx = createNumber("kbIdx", Long.class);

    public final QProject project;

    public QKanban(String variable) {
        this(Kanban.class, forVariable(variable), INITS);
    }

    public QKanban(Path<? extends Kanban> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QKanban(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QKanban(PathMetadata metadata, PathInits inits) {
        this(Kanban.class, metadata, inits);
    }

    public QKanban(Class<? extends Kanban> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.project = inits.isInitialized("project") ? new QProject(forProperty("project")) : null;
    }

}

