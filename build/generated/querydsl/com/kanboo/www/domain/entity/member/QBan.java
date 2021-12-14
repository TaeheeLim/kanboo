package com.kanboo.www.domain.entity.member;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QBan is a Querydsl query type for Ban
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QBan extends EntityPathBase<Ban> {

    private static final long serialVersionUID = 601246698L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QBan ban = new QBan("ban");

    public final DateTimePath<java.time.LocalDateTime> banEndDate = createDateTime("banEndDate", java.time.LocalDateTime.class);

    public final NumberPath<Long> banIdx = createNumber("banIdx", Long.class);

    public final DateTimePath<java.time.LocalDateTime> banStartDate = createDateTime("banStartDate", java.time.LocalDateTime.class);

    public final QMember member;

    public QBan(String variable) {
        this(Ban.class, forVariable(variable), INITS);
    }

    public QBan(Path<? extends Ban> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QBan(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QBan(PathMetadata metadata, PathInits inits) {
        this(Ban.class, metadata, inits);
    }

    public QBan(Class<? extends Ban> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.member = inits.isInitialized("member") ? new QMember(forProperty("member"), inits.get("member")) : null;
    }

}

