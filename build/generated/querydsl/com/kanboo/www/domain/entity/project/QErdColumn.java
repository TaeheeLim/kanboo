package com.kanboo.www.domain.entity.project;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QErdColumn is a Querydsl query type for ErdColumn
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QErdColumn extends EntityPathBase<ErdColumn> {

    private static final long serialVersionUID = -865327447L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QErdColumn erdColumn = new QErdColumn("erdColumn");

    public final QErd erd;

    public final StringPath erdColumnConstraint = createString("erdColumnConstraint");

    public final NumberPath<Long> erdColumnIdx = createNumber("erdColumnIdx", Long.class);

    public final StringPath erdColumnName = createString("erdColumnName");

    public final StringPath erdColumnReferences = createString("erdColumnReferences");

    public final StringPath erdColumnType = createString("erdColumnType");

    public QErdColumn(String variable) {
        this(ErdColumn.class, forVariable(variable), INITS);
    }

    public QErdColumn(Path<? extends ErdColumn> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QErdColumn(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QErdColumn(PathMetadata metadata, PathInits inits) {
        this(ErdColumn.class, metadata, inits);
    }

    public QErdColumn(Class<? extends ErdColumn> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.erd = inits.isInitialized("erd") ? new QErd(forProperty("erd"), inits.get("erd")) : null;
    }

}

