package core.dao;

import core.entity.info.CardInfo;
import core.iterfaces.Repository;

import java.util.List;

public class CardService implements Repository<CardInfo> {

    @Override
    public CardInfo addElement(CardInfo element) {
        return null;
    }

    @Override
    public CardInfo updateElement(CardInfo element) {
        return null;
    }

    @Override
    public boolean deleteElement(CardInfo element) {
        return false;
    }

    @Override
    public List<CardInfo> getElements(CardInfo element) {
        return null;
    }
}
