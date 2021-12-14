package com.kanboo.www.domain.entity.project.idclass;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QGitId is a Querydsl query type for GitId
 */
@Generated("com.querydsl.codegen.EmbeddableSerializer")
public class QGitId extends BeanPath<GitId> {

    private static final long serialVersionUID = 1693661624L;

    public static final QGitId gitId = new QGitId("gitId");

    public final NumberPath<Long> project = createNumber("project", Long.class);

    public QGitId(String variable) {
        super(GitId.class, forVariable(variable));
    }

    public QGitId(Path<? extends GitId> path) {
        super(path.getType(), path.getMetadata());
    }

    public QGitId(PathMetadata metadata) {
        super(GitId.class, metadata);
    }

}

