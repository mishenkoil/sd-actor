package ru.mishenkoil.sd.actors.search;

import ru.mishenkoil.sd.model.SourceId;

import akka.actor.typed.Behavior;


public class GoogleSearchActorTests extends SearchActorTests {

    @Override
    SearchApiStub createSearchApiStub() {
        return new SearchApiStub(8091);
    }

    @Override
    Behavior<SearchActor.MakeRequest> createSearchActor() {
        return GoogleSearchActor.create();
    }

    @Override
    SourceId getSourceId() {
        return SourceId.GOOGLE;
    }
}
