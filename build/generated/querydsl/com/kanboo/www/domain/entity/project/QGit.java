package com.kanboo.www.domain.entity.project;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QGit is a Querydsl query type for Git
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QGit extends EntityPathBase<Git> {

    private static final long serialVersionUID = -819556370L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QGit git = new QGit("git");

    public final StringPath gitRepo = createString("gitRepo");

    public final com.kanboo.www.domain.entity.project.idclass.QGitId id;

    public final QProject project;

    public QGit(String variable) {
        this(Git.class, forVariable(variable), INITS);
    }

    public QGit(Path<? extends Git> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QGit(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QGit(PathMetadata metadata, PathInits inits) {
        this(Git.class, metadata, inits);
    }

    public QGit(Class<? extends Git> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.id = inits.isInitialized("id") ? new com.kanboo.www.domain.entity.project.idclass.QGitId(forProperty("id")) : null;
        this.project = inits.isInitialized("project") ? new QProject(forProperty("project")) : null;
    }

}

