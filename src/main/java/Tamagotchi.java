import java.util.ArrayList;

public class Tamagotchi {
  private String mName;
  private Integer mPoopCount;
  private Integer mFullnessLevel;
  private Integer mEnergyLevel;
  private Integer mHappinessLevel;

  public Tamagotchi(String name, String poopCount, String fullnessLevel, String energyLevel, String happinessLevel) {
    // public static final Integer MAX_POOP = 5;
    // public static final Integer MAX_HUNGER = 10;
    // public static final Integer MAX_ENERGY = 10;
    // public static final Integer MAX_HAPPY = 10;

    mName = name;
    mPoopCount = Integer.parseInt(poopCount);
    mFullnessLevel = Integer.parseInt(fullnessLevel);
    mEnergyLevel = Integer.parseInt(energyLevel);
    mHappinessLevel = Integer.parseInt(happinessLevel);
  }

  public String getName() {
    return mName;
  }

  public Integer getPoopCount() {
    return mPoopCount;
  }

  public Integer getFullnessLevel() {
    return mFullnessLevel;
  }

  public Integer getEnergyLevel() {
    return mEnergyLevel;
  }

  public Integer getHappinessLevel() {
    return mHappinessLevel;
  }

  public void feedTamagotchi() {
    // poop
    mFullnessLevel += 1;
    mEnergyLevel += 2;
    mHappinessLevel += 1;
  }

  public void playWithTamagotchi() {
    // poop
    mFullnessLevel -= 2;
    mEnergyLevel -= 2;
    mHappinessLevel += 2;
  }

  public void putToBedTamagotchi() {
    // poop
    mFullnessLevel -= 3;
    mEnergyLevel += 5;
    mHappinessLevel -= 2;
  }

  public void cleanTamagotchi() {
    // poop goes to 0
    mFullnessLevel += 2;
    mEnergyLevel -= 2;
    mHappinessLevel -= 2;
  }
}
