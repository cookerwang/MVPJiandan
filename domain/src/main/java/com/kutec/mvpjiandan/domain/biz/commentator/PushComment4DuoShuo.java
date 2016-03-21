package com.kutec.mvpjiandan.domain.biz.commentator;

import com.kutec.mvpjiandan.domain.common.executor.PostExecutionThread;
import com.kutec.mvpjiandan.domain.common.executor.ThreadExecutor;
import com.kutec.mvpjiandan.domain.common.interactor.UseCase;

import java.util.Map;

import javax.inject.Inject;

import rx.Observable;

/**
 * Created by Administrator on 2016/3/18.
 */
public final class PushComment4DuoShuo extends UseCase {

    private final Map<String, String> comments;
    private final CommentRepository commentRepository;

    @Inject
    public PushComment4DuoShuo(ThreadExecutor threadExecutor, PostExecutionThread postExecutionThread, Map<String, String> comments, CommentRepository commentRepository) {
        super(threadExecutor, postExecutionThread);
        this.comments = comments;
        this.commentRepository = commentRepository;
    }

    @Override
    protected Observable buildUseCaseObservable() {
        return commentRepository.pushComment4DuoShuo(comments);
    }
}
