package com.kanboo.www.domain.entity.project;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QDemand is a Querydsl query type for Demand
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QDemand extends EntityPathBase<Demand> {

    private static final long serialVersionUID = 1395565743L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QDemand demand = new QDemand("demand");

    public final NumberPath<Long> demandIdx = createNumber("demandIdx", Long.class);

    public final DateTimePath<java.time.LocalDateTime> demandReviseDate = createDateTime("demandReviseDate", java.time.LocalDateTime.class);

    public final QProject project;

    public QDemand(String variable) {
        this(Demand.class, forVariable(variable), INITS);
    }

    public QDemand(Path<? extends Demand> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QDemand(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QDemand(PathMetadata metadata, PathInits inits) {
        this(Demand.class, metadata, inits);
    }

    public QDemand(Class<? extends Demand> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.project = inits.isInitialized("project") ? new QProject(forProperty("project")) : null;
    }

}

