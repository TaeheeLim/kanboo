package com.kanboo.www.domain.entity.project;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCalendar is a Querydsl query type for Calendar
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCalendar extends EntityPathBase<Calendar> {

    private static final long serialVersionUID = 86092962L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCalendar calendar = new QCalendar("calendar");

    public final StringPath calCn = createString("calCn");

    public final StringPath calColor = createString("calColor");

    public final StringPath calDelAt = createString("calDelAt");

    public final StringPath calDelResn = createString("calDelResn");

    public final DateTimePath<java.time.LocalDateTime> calEndDate = createDateTime("calEndDate", java.time.LocalDateTime.class);

    public final NumberPath<Long> calIdx = createNumber("calIdx", Long.class);

    public final DateTimePath<java.time.LocalDateTime> calStartDate = createDateTime("calStartDate", java.time.LocalDateTime.class);

    public final StringPath calTitle = createString("calTitle");

    public final com.kanboo.www.domain.entity.global.QCodeDetail codeDetail;

    public final com.kanboo.www.domain.entity.member.QMember member;

    public final QProject project;

    public QCalendar(String variable) {
        this(Calendar.class, forVariable(variable), INITS);
    }

    public QCalendar(Path<? extends Calendar> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCalendar(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCalendar(PathMetadata metadata, PathInits inits) {
        this(Calendar.class, metadata, inits);
    }

    public QCalendar(Class<? extends Calendar> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.codeDetail = inits.isInitialized("codeDetail") ? new com.kanboo.www.domain.entity.global.QCodeDetail(forProperty("codeDetail"), inits.get("codeDetail")) : null;
        this.member = inits.isInitialized("member") ? new com.kanboo.www.domain.entity.member.QMember(forProperty("member"), inits.get("member")) : null;
        this.project = inits.isInitialized("project") ? new QProject(forProperty("project")) : null;
    }

}

