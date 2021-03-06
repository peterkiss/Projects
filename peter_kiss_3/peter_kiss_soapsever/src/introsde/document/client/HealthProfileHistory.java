package introsde.document.client;
import introsde.document.model.LifeStatus;
import introsde.document.model.Person;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
 
@XmlRootElement(name = "healthProfile-History")
@XmlAccessorType (XmlAccessType.FIELD)
public class HealthProfileHistory
{
    @XmlElement(name = "measure")
    private List<LifeStatus> measures = null;
 
    public List<LifeStatus> getMeasures() {
        return measures;
    }
 
    public void setMeasures(List<LifeStatus> measures) {
        this.measures = measures;
    }
}