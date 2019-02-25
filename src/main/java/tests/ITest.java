package tests;

import samples.ISample;

public interface ITest {

    public String getTestInfo();

    public void setName(String name);

    public String getName();

    public ISample getSample();

    public void setSample(ISample sample);

    public String toString();
}
