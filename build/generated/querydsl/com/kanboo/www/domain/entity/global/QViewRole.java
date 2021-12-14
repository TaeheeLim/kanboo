package com.kanboo.www.domain.entity.global;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QViewRole is a Querydsl query type for ViewRole
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QViewRole extends EntityPathBase<ViewRole> {

    private static final long serialVersionUID = -92875049L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QViewRole viewRole = new QViewRole("viewRole");

    public final QRole role;

    public final QView view;

    public QViewRole(String variable) {
        this(ViewRole.class, forVariable(variable), INITS);
    }

    public QViewRole(Path<? extends ViewRole> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QViewRole(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QViewRole(PathMetadata metadata, PathInits inits) {
        this(ViewRole.class, metadata, inits);
    }

    public QViewRole(Class<? extends ViewRole> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.role = inits.isInitialized("role") ? new QRole(forProperty("role")) : null;
        this.view = inits.isInitialized("view") ? new QView(forProperty("view")) : null;
    }

}

