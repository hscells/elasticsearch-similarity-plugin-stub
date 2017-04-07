package com.github.hscells.customsimilarity;

import org.elasticsearch.index.IndexModule;
import org.elasticsearch.plugins.Plugin;

/**
 * Created by Harry Scells on 7/4/17.
 */
public class MyCustomSimilarityPlugin extends Plugin {

    private static final String SIMILARITY_NAME = "my_custom_similarity";

    @Override
    public void onIndexModule(IndexModule indexModule) {
        super.onIndexModule(indexModule);
        indexModule.addSimilarity(SIMILARITY_NAME, MyCustomSimilarityProvider::new);
    }
}
