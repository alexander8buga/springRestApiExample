
package guru.springframework.api.domain;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author ab 
 * Created on 01/09/18
 *
 */
public class Billing {

    private Card card;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
