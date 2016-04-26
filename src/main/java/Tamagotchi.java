import java.util.ArrayList;

public class Tamagotchi {
  private String mName;
  private Integer mPoopCount;
  private Integer mHungerLevel;
  private Integer mEnergyLevel;
  private Integer mHappinessLevel;

  public Tamagotchi(String name, String poopCount, String hungerLevel, String energyLevel, String happinessLevel) {
    mName = name;
    mPoopCount = Integer.parseInt(poopCount);
    mHungerLevel = Integer.parseInt(hungerLevel);
    mEnergyLevel = Integer.parseInt(energyLevel);
    mHappinessLevel = Integer.parseInt(happinessLevel);
  }

  public String getName() {
    return mName;
  }

  public Integer getPoopCount() {
    return mPoopCount;
  }

  public Integer getHungerLevel() {
    return mHungerLevel;
  }

  public Integer getEnergyLevel() {
    return mEnergyLevel;
  }

  public Integer getHappinessLevel() {
    return mHappinessLevel;
  }

  public void feedTamagotchi() {
    // poop
    mHungerLevel -= 1;
    mEnergyLevel += 2;
    mHappinessLevel += 1;
  }

  public void playWithTamagotchi() {
    // poop
    mHungerLevel += 2;
    mEnergyLevel -= 2;
    mHappinessLevel += 2;
  }


}
