package ru.mishenkoil.sd.actors.search;

import ru.mishenkoil.sd.model.SourceId;

import akka.actor.typed.Behavior;


public class BingSearchActorTests extends SearchActorTests {

    @Override
    SearchApiStub createSearchApiStub() {
        return new SearchApiStub(8092);
    }

    @Override
    Behavior<SearchActor.MakeRequest> createSearchActor() {
        return BingSearchActor.create();
    }

    @Override
    SourceId getSourceId() {
        return SourceId.BING;
    }
}
