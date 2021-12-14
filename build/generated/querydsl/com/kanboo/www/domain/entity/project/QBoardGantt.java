package com.kanboo.www.domain.entity.project;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QBoardGantt is a Querydsl query type for BoardGantt
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QBoardGantt extends EntityPathBase<BoardGantt> {

    private static final long serialVersionUID = -1858559630L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QBoardGantt boardGantt = new QBoardGantt("boardGantt");

    public final QGantt gantt;

    public final com.kanboo.www.domain.entity.board.QProjectBoard projectBoard;

    public QBoardGantt(String variable) {
        this(BoardGantt.class, forVariable(variable), INITS);
    }

    public QBoardGantt(Path<? extends BoardGantt> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QBoardGantt(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QBoardGantt(PathMetadata metadata, PathInits inits) {
        this(BoardGantt.class, metadata, inits);
    }

    public QBoardGantt(Class<? extends BoardGantt> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.gantt = inits.isInitialized("gantt") ? new QGantt(forProperty("gantt"), inits.get("gantt")) : null;
        this.projectBoard = inits.isInitialized("projectBoard") ? new com.kanboo.www.domain.entity.board.QProjectBoard(forProperty("projectBoard"), inits.get("projectBoard")) : null;
    }

}

