package com.chc.design_coding.memento;

import java.util.Stack;

/**
 * @Author chc 
 * @Date 2019/4/24 20:32
 */
public class ArticleMementoManager {

    private final Stack<ArticleMemento> ARTICLE_MEMENTO_STACK = new Stack<ArticleMemento>();

    public ArticleMemento getMemento()
    {
        ArticleMemento articleMemento= ARTICLE_MEMENTO_STACK.pop();
        return articleMemento;
    }

    public void addMemento(ArticleMemento articleMemento)
    {
        ARTICLE_MEMENTO_STACK.push(articleMemento);
    }

}
