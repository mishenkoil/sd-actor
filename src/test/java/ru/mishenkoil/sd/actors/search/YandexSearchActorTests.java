package ru.mishenkoil.sd.actors.search;

import ru.mishenkoil.sd.model.SourceId;

import akka.actor.typed.Behavior;


public class YandexSearchActorTests extends SearchActorTests {

    @Override
    SearchApiStub createSearchApiStub() {
        return new SearchApiStub(8090);
    }

    @Override
    Behavior<SearchActor.MakeRequest> createSearchActor() {
        return YandexSearchActor.create();
    }

    @Override
    SourceId getSourceId() {
        return SourceId.YANDEX;
    }
}
