package com.github.hscells.customsimilarity;

import org.apache.lucene.index.FieldInvertState;
import org.apache.lucene.index.LeafReaderContext;
import org.apache.lucene.search.CollectionStatistics;
import org.apache.lucene.search.TermStatistics;
import org.apache.lucene.search.similarities.Normalization;
import org.apache.lucene.search.similarities.Similarity;

import java.io.IOException;

/**
 * Created by Harry Scells on 6/4/17.
 */
class MyCustomSimilarity extends Similarity {

    private Normalization normalization;

    MyCustomSimilarity(Normalization normalization) {
        this.normalization = normalization;
    }

    @Override
    public long computeNorm(FieldInvertState state) {
        return 0;
    }

    @Override
    public SimWeight computeWeight(CollectionStatistics collectionStats, TermStatistics... termStats) {
        return null;
    }

    @Override
    public SimScorer simScorer(SimWeight weight, LeafReaderContext context) throws IOException {
        return null;
    }
}
