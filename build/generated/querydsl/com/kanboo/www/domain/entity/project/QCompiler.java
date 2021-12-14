package com.kanboo.www.domain.entity.project;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCompiler is a Querydsl query type for Compiler
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCompiler extends EntityPathBase<Compiler> {

    private static final long serialVersionUID = -335110653L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCompiler compiler1 = new QCompiler("compiler1");

    public final NumberPath<Long> comIdx = createNumber("comIdx", Long.class);

    public final StringPath comNm = createString("comNm");

    public final QCompiler compiler;

    public final StringPath comSe = createString("comSe");

    public final QProject project;

    public QCompiler(String variable) {
        this(Compiler.class, forVariable(variable), INITS);
    }

    public QCompiler(Path<? extends Compiler> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCompiler(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCompiler(PathMetadata metadata, PathInits inits) {
        this(Compiler.class, metadata, inits);
    }

    public QCompiler(Class<? extends Compiler> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.compiler = inits.isInitialized("compiler") ? new QCompiler(forProperty("compiler"), inits.get("compiler")) : null;
        this.project = inits.isInitialized("project") ? new QProject(forProperty("project")) : null;
    }

}

