package com.kanboo.www.domain.entity.global;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QView is a Querydsl query type for View
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QView extends EntityPathBase<View> {

    private static final long serialVersionUID = -766170431L;

    public static final QView view = new QView("view");

    public final NumberPath<Long> viewIdx = createNumber("viewIdx", Long.class);

    public final StringPath viewNm = createString("viewNm");

    public final StringPath viewURL = createString("viewURL");

    public QView(String variable) {
        super(View.class, forVariable(variable));
    }

    public QView(Path<? extends View> path) {
        super(path.getType(), path.getMetadata());
    }

    public QView(PathMetadata metadata) {
        super(View.class, metadata);
    }

}

