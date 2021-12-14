package com.kanboo.www.domain.entity.board;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QBoardReport is a Querydsl query type for BoardReport
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QBoardReport extends EntityPathBase<BoardReport> {

    private static final long serialVersionUID = -1617618845L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QBoardReport boardReport = new QBoardReport("boardReport");

    public final QBoard board;

    public final NumberPath<Long> boardReportIdx = createNumber("boardReportIdx", Long.class);

    public final StringPath boardReportResn = createString("boardReportResn");

    public final com.kanboo.www.domain.entity.member.QMember member;

    public QBoardReport(String variable) {
        this(BoardReport.class, forVariable(variable), INITS);
    }

    public QBoardReport(Path<? extends BoardReport> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QBoardReport(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QBoardReport(PathMetadata metadata, PathInits inits) {
        this(BoardReport.class, metadata, inits);
    }

    public QBoardReport(Class<? extends BoardReport> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.board = inits.isInitialized("board") ? new QBoard(forProperty("board"), inits.get("board")) : null;
        this.member = inits.isInitialized("member") ? new com.kanboo.www.domain.entity.member.QMember(forProperty("member"), inits.get("member")) : null;
    }

}

