package com.kanboo.www.domain.entity.board;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QBoard is a Querydsl query type for Board
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QBoard extends EntityPathBase<Board> {

    private static final long serialVersionUID = 1595543119L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QBoard board = new QBoard("board");

    public final StringPath boardCn = createString("boardCn");

    public final DateTimePath<java.time.LocalDateTime> boardDate = createDateTime("boardDate", java.time.LocalDateTime.class);

    public final NumberPath<Long> boardIdx = createNumber("boardIdx", Long.class);

    public final com.kanboo.www.domain.entity.global.QCodeDetail codeDetail;

    public final StringPath delAt = createString("delAt");

    public final StringPath fileAt = createString("fileAt");

    public final NumberPath<Integer> likeNum = createNumber("likeNum", Integer.class);

    public final com.kanboo.www.domain.entity.member.QMember member;

    public final NumberPath<Integer> reportNum = createNumber("reportNum", Integer.class);

    public QBoard(String variable) {
        this(Board.class, forVariable(variable), INITS);
    }

    public QBoard(Path<? extends Board> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QBoard(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QBoard(PathMetadata metadata, PathInits inits) {
        this(Board.class, metadata, inits);
    }

    public QBoard(Class<? extends Board> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.codeDetail = inits.isInitialized("codeDetail") ? new com.kanboo.www.domain.entity.global.QCodeDetail(forProperty("codeDetail"), inits.get("codeDetail")) : null;
        this.member = inits.isInitialized("member") ? new com.kanboo.www.domain.entity.member.QMember(forProperty("member"), inits.get("member")) : null;
    }

}

