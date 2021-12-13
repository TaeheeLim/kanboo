package com.kanboo.www.domain.entity.project;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QNotification is a Querydsl query type for Notification
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QNotification extends EntityPathBase<Notification> {

    private static final long serialVersionUID = 1174267983L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QNotification notification = new QNotification("notification");

    public final com.kanboo.www.domain.entity.global.QCodeDetail codeDetail;

    public final com.kanboo.www.domain.entity.member.QMember member;

    public final StringPath ntcnAt = createString("ntcnAt");

    public final StringPath ntcnCn = createString("ntcnCn");

    public final DateTimePath<java.time.LocalDateTime> ntcnDate = createDateTime("ntcnDate", java.time.LocalDateTime.class);

    public final NumberPath<Long> ntcnIdx = createNumber("ntcnIdx", Long.class);

    public final QProject project;

    public QNotification(String variable) {
        this(Notification.class, forVariable(variable), INITS);
    }

    public QNotification(Path<? extends Notification> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QNotification(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QNotification(PathMetadata metadata, PathInits inits) {
        this(Notification.class, metadata, inits);
    }

    public QNotification(Class<? extends Notification> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.codeDetail = inits.isInitialized("codeDetail") ? new com.kanboo.www.domain.entity.global.QCodeDetail(forProperty("codeDetail"), inits.get("codeDetail")) : null;
        this.member = inits.isInitialized("member") ? new com.kanboo.www.domain.entity.member.QMember(forProperty("member"), inits.get("member")) : null;
        this.project = inits.isInitialized("project") ? new QProject(forProperty("project")) : null;
    }

}

