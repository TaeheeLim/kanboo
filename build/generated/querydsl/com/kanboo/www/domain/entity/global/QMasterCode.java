package com.kanboo.www.domain.entity.global;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QMasterCode is a Querydsl query type for MasterCode
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QMasterCode extends EntityPathBase<MasterCode> {

    private static final long serialVersionUID = 797292171L;

    public static final QMasterCode masterCode = new QMasterCode("masterCode");

    public final StringPath masterCodeEn = createString("masterCodeEn");

    public final StringPath masterCodeIdx = createString("masterCodeIdx");

    public final StringPath masterCodeKo = createString("masterCodeKo");

    public QMasterCode(String variable) {
        super(MasterCode.class, forVariable(variable));
    }

    public QMasterCode(Path<? extends MasterCode> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMasterCode(PathMetadata metadata) {
        super(MasterCode.class, metadata);
    }

}

