package com.kanboo.www.domain.entity.project;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCalendarCheck is a Querydsl query type for CalendarCheck
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCalendarCheck extends EntityPathBase<CalendarCheck> {

    private static final long serialVersionUID = -1587815034L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCalendarCheck calendarCheck = new QCalendarCheck("calendarCheck");

    public final NumberPath<Long> calChkIdx = createNumber("calChkIdx", Long.class);

    public final QCalendar calendar;

    public final com.kanboo.www.domain.entity.member.QMember member;

    public QCalendarCheck(String variable) {
        this(CalendarCheck.class, forVariable(variable), INITS);
    }

    public QCalendarCheck(Path<? extends CalendarCheck> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCalendarCheck(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCalendarCheck(PathMetadata metadata, PathInits inits) {
        this(CalendarCheck.class, metadata, inits);
    }

    public QCalendarCheck(Class<? extends CalendarCheck> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.calendar = inits.isInitialized("calendar") ? new QCalendar(forProperty("calendar"), inits.get("calendar")) : null;
        this.member = inits.isInitialized("member") ? new com.kanboo.www.domain.entity.member.QMember(forProperty("member"), inits.get("member")) : null;
    }

}

