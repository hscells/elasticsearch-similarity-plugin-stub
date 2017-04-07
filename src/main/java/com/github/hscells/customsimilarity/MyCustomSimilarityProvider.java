package com.github.hscells.customsimilarity;

import org.apache.lucene.search.similarities.Normalization;
import org.apache.lucene.search.similarities.Similarity;
import org.elasticsearch.common.inject.Inject;
import org.elasticsearch.common.inject.assistedinject.Assisted;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.index.similarity.AbstractSimilarityProvider;

/**
 * Created by Harry Scells on 7/4/17.
 */
public class MyCustomSimilarityProvider extends AbstractSimilarityProvider {

    private MyCustomSimilarity similarity;
    private Normalization normalization;

    @Inject
    public MyCustomSimilarityProvider(@Assisted String name, @Assisted Settings settings) {
        super(name);
        this.normalization = this.parseNormalization(settings);

        this.similarity = new MyCustomSimilarity(this.normalization);
    }

    @Override
    public Similarity get() {
        return similarity;
    }
}
