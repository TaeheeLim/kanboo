package com.kanboo.www.domain.entity.board;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QProjectBoard is a Querydsl query type for ProjectBoard
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QProjectBoard extends EntityPathBase<ProjectBoard> {

    private static final long serialVersionUID = 965682116L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QProjectBoard projectBoard = new QProjectBoard("projectBoard");

    public final QBoard board;

    public final com.kanboo.www.domain.entity.project.QProject project;

    public QProjectBoard(String variable) {
        this(ProjectBoard.class, forVariable(variable), INITS);
    }

    public QProjectBoard(Path<? extends ProjectBoard> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QProjectBoard(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QProjectBoard(PathMetadata metadata, PathInits inits) {
        this(ProjectBoard.class, metadata, inits);
    }

    public QProjectBoard(Class<? extends ProjectBoard> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.board = inits.isInitialized("board") ? new QBoard(forProperty("board"), inits.get("board")) : null;
        this.project = inits.isInitialized("project") ? new com.kanboo.www.domain.entity.project.QProject(forProperty("project")) : null;
    }

}

