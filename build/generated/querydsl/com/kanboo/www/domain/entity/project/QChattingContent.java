package com.kanboo.www.domain.entity.project;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QChattingContent is a Querydsl query type for ChattingContent
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QChattingContent extends EntityPathBase<ChattingContent> {

    private static final long serialVersionUID = 2059603311L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QChattingContent chattingContent = new QChattingContent("chattingContent");

    public final QChat chat;

    public final StringPath chatCn = createString("chatCn");

    public final DateTimePath<java.time.LocalDateTime> chatCnDate = createDateTime("chatCnDate", java.time.LocalDateTime.class);

    public final NumberPath<Long> chatContentIdx = createNumber("chatContentIdx", Long.class);

    public QChattingContent(String variable) {
        this(ChattingContent.class, forVariable(variable), INITS);
    }

    public QChattingContent(Path<? extends ChattingContent> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QChattingContent(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QChattingContent(PathMetadata metadata, PathInits inits) {
        this(ChattingContent.class, metadata, inits);
    }

    public QChattingContent(Class<? extends ChattingContent> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.chat = inits.isInitialized("chat") ? new QChat(forProperty("chat"), inits.get("chat")) : null;
    }

}

