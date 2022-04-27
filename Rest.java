public class Rest
{
    public static int restoreHealth(int currentHealth, int maxHealth)
    {
        if(currentHealth != maxHealth) {
            currentHealth = maxHealth;
            return currentHealth;
        }
        return currentHealth;
    }
    public static int restoreMP(int currentMP, int maxMp)
    {
        if(currentMP != maxMp) {
            currentMP = maxMp;
            return currentMP;
        }
        return currentMP;
    }
}
