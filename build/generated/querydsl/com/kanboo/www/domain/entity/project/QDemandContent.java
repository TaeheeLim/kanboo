package com.kanboo.www.domain.entity.project;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QDemandContent is a Querydsl query type for DemandContent
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QDemandContent extends EntityPathBase<DemandContent> {

    private static final long serialVersionUID = 1018057930L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QDemandContent demandContent = new QDemandContent("demandContent");

    public final QDemand demand;

    public final StringPath demandCnDetail = createString("demandCnDetail");

    public final StringPath demandCnId = createString("demandCnId");

    public final NumberPath<Long> demandCnIdx = createNumber("demandCnIdx", Long.class);

    public final StringPath demandCnNm = createString("demandCnNm");

    public final StringPath demandCnNum = createString("demandCnNum");

    public final StringPath demandCnRequstNm = createString("demandCnRequstNm");

    public final StringPath demandCnRm = createString("demandCnRm");

    public final StringPath demandCnSe = createString("demandCnSe");

    public QDemandContent(String variable) {
        this(DemandContent.class, forVariable(variable), INITS);
    }

    public QDemandContent(Path<? extends DemandContent> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QDemandContent(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QDemandContent(PathMetadata metadata, PathInits inits) {
        this(DemandContent.class, metadata, inits);
    }

    public QDemandContent(Class<? extends DemandContent> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.demand = inits.isInitialized("demand") ? new QDemand(forProperty("demand"), inits.get("demand")) : null;
    }

}

