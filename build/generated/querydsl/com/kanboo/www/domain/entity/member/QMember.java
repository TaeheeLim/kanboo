package com.kanboo.www.domain.entity.member;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMember is a Querydsl query type for Member
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QMember extends EntityPathBase<Member> {

    private static final long serialVersionUID = 2045438175L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMember member = new QMember("member1");

    public final StringPath memCelNum = createString("memCelNum");

    public final StringPath memId = createString("memId");

    public final NumberPath<Long> memIdx = createNumber("memIdx", Long.class);

    public final StringPath memImg = createString("memImg");

    public final StringPath memNick = createString("memNick");

    public final StringPath memPass = createString("memPass");

    public final StringPath memTag = createString("memTag");

    public final StringPath memToken = createString("memToken");

    public final com.kanboo.www.domain.entity.global.QRole role;

    public QMember(String variable) {
        this(Member.class, forVariable(variable), INITS);
    }

    public QMember(Path<? extends Member> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMember(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMember(PathMetadata metadata, PathInits inits) {
        this(Member.class, metadata, inits);
    }

    public QMember(Class<? extends Member> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.role = inits.isInitialized("role") ? new com.kanboo.www.domain.entity.global.QRole(forProperty("role")) : null;
    }

}

