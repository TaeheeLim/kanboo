package com.kanboo.www.domain.entity.project;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QGantt is a Querydsl query type for Gantt
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QGantt extends EntityPathBase<Gantt> {

    private static final long serialVersionUID = -1614896784L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QGantt gantt = new QGantt("gantt");

    public final DateTimePath<java.time.LocalDateTime> gtEndDate = createDateTime("gtEndDate", java.time.LocalDateTime.class);

    public final StringPath gtExplanation = createString("gtExplanation");

    public final NumberPath<Long> gtIdx = createNumber("gtIdx", Long.class);

    public final StringPath gtPriority = createString("gtPriority");

    public final NumberPath<Integer> gtProgress = createNumber("gtProgress", Integer.class);

    public final DateTimePath<java.time.LocalDateTime> gtStartDate = createDateTime("gtStartDate", java.time.LocalDateTime.class);

    public final StringPath gtState = createString("gtState");

    public final StringPath gtTitle = createString("gtTitle");

    public final com.kanboo.www.domain.entity.member.QMember member;

    public final QProject project;

    public QGantt(String variable) {
        this(Gantt.class, forVariable(variable), INITS);
    }

    public QGantt(Path<? extends Gantt> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QGantt(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QGantt(PathMetadata metadata, PathInits inits) {
        this(Gantt.class, metadata, inits);
    }

    public QGantt(Class<? extends Gantt> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.member = inits.isInitialized("member") ? new com.kanboo.www.domain.entity.member.QMember(forProperty("member"), inits.get("member")) : null;
        this.project = inits.isInitialized("project") ? new QProject(forProperty("project")) : null;
    }

}

