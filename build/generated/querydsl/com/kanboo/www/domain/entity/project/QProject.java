package com.kanboo.www.domain.entity.project;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QProject is a Querydsl query type for Project
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QProject extends EntityPathBase<Project> {

    private static final long serialVersionUID = -1547707083L;

    public static final QProject project = new QProject("project");

    public final StringPath prjctComplAt = createString("prjctComplAt");

    public final StringPath prjctDelAt = createString("prjctDelAt");

    public final DateTimePath<java.time.LocalDateTime> prjctEndDate = createDateTime("prjctEndDate", java.time.LocalDateTime.class);

    public final NumberPath<Long> prjctIdx = createNumber("prjctIdx", Long.class);

    public final StringPath prjctNm = createString("prjctNm");

    public final NumberPath<Integer> prjctProgress = createNumber("prjctProgress", Integer.class);

    public final DateTimePath<java.time.LocalDateTime> prjctStartDate = createDateTime("prjctStartDate", java.time.LocalDateTime.class);

    public QProject(String variable) {
        super(Project.class, forVariable(variable));
    }

    public QProject(Path<? extends Project> path) {
        super(path.getType(), path.getMetadata());
    }

    public QProject(PathMetadata metadata) {
        super(Project.class, metadata);
    }

}

