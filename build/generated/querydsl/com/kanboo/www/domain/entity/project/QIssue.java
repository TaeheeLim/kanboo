package com.kanboo.www.domain.entity.project;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QIssue is a Querydsl query type for Issue
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QIssue extends EntityPathBase<Issue> {

    private static final long serialVersionUID = -1612508683L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QIssue issue = new QIssue("issue");

    public final StringPath issueCn = createString("issueCn");

    public final DateTimePath<java.time.LocalDateTime> issueDate = createDateTime("issueDate", java.time.LocalDateTime.class);

    public final NumberPath<Long> issueIdx = createNumber("issueIdx", Long.class);

    public final StringPath issueState = createString("issueState");

    public final com.kanboo.www.domain.entity.member.QMember member;

    public final QProject project;

    public QIssue(String variable) {
        this(Issue.class, forVariable(variable), INITS);
    }

    public QIssue(Path<? extends Issue> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QIssue(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QIssue(PathMetadata metadata, PathInits inits) {
        this(Issue.class, metadata, inits);
    }

    public QIssue(Class<? extends Issue> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.member = inits.isInitialized("member") ? new com.kanboo.www.domain.entity.member.QMember(forProperty("member"), inits.get("member")) : null;
        this.project = inits.isInitialized("project") ? new QProject(forProperty("project")) : null;
    }

}

