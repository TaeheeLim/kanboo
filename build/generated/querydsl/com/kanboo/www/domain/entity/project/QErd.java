package com.kanboo.www.domain.entity.project;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QErd is a Querydsl query type for Erd
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QErd extends EntityPathBase<Erd> {

    private static final long serialVersionUID = -819558029L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QErd erd = new QErd("erd");

    public final NumberPath<Long> erdIdx = createNumber("erdIdx", Long.class);

    public final StringPath erdName = createString("erdName");

    public final NumberPath<Integer> erdOrder = createNumber("erdOrder", Integer.class);

    public final QProject project;

    public QErd(String variable) {
        this(Erd.class, forVariable(variable), INITS);
    }

    public QErd(Path<? extends Erd> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QErd(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QErd(PathMetadata metadata, PathInits inits) {
        this(Erd.class, metadata, inits);
    }

    public QErd(Class<? extends Erd> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.project = inits.isInitialized("project") ? new QProject(forProperty("project")) : null;
    }

}

