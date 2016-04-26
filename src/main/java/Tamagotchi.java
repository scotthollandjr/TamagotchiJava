import java.util.ArrayList;

public class Tamagotchi {
  private String mName;
  private String mPoopCount;
  private String mHungerLevel;
  private String mEnergyLevel;
  private String mHappinessLevel;

  public Tamagotchi(String name, String poopCount, String hungerLevel, String energyLevel, String happinessLevel) {
    mName = name;
    mPoopCount = poopCount;
    mHungerLevel = hungerLevel;
    mEnergyLevel = energyLevel;
    mHappinessLevel = happinessLevel;
  }
  public String getName() {
    return mName;
  }
  public String getPoopCount() {
    return mPoopCount;
  }
  public String getHungerLevel() {
    return mHungerLevel;
  }
  public String getEnergyLevel() {
    return mEnergyLevel;
  }
  public String getHappinessLevel() {
    return mHappinessLevel;
  }
}
