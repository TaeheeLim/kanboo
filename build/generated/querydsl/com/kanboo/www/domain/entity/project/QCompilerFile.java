package com.kanboo.www.domain.entity.project;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCompilerFile is a Querydsl query type for CompilerFile
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCompilerFile extends EntityPathBase<CompilerFile> {

    private static final long serialVersionUID = 735268383L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCompilerFile compilerFile = new QCompilerFile("compilerFile");

    public final StringPath comFileCn = createString("comFileCn");

    public final NumberPath<Long> comFileIdx = createNumber("comFileIdx", Long.class);

    public final QCompiler compiler;

    public QCompilerFile(String variable) {
        this(CompilerFile.class, forVariable(variable), INITS);
    }

    public QCompilerFile(Path<? extends CompilerFile> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCompilerFile(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCompilerFile(PathMetadata metadata, PathInits inits) {
        this(CompilerFile.class, metadata, inits);
    }

    public QCompilerFile(Class<? extends CompilerFile> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.compiler = inits.isInitialized("compiler") ? new QCompiler(forProperty("compiler"), inits.get("compiler")) : null;
    }

}

