/**
 * Created by Toshiba on 3/18/2016.
 */

public class Board {
    private int dirdx; // direction on x ( -1, 0 or 1)
    private int dirdy; // direction on y ( -1, 0 or 1)
    private int viewdx;
    private int viewdy;
    private int nbofghosts = 6;
    private final int blocksize = 24;
    private int currentspeed = 3;
    private boolean dying = false;
    private Ghost ghosts[];
    public int getDirdx() {
        return dirdx;
    }

    public void setDirdx(int dirdx) {
        this.dirdx = dirdx;
    }

    public int getDirdy() {
        return dirdy;
    }

    public void setDirdy(int dirdy)
    {
        this.dirdy=dirdy;
    }


    private void continueLevel()
    {
        int i;
        int dx =1;
        int random;

        for(i =0; i< nbofghosts; i++)
        {
            ghosts[i] = new Ghost();
            ghosts[i].setX(4*blocksize);
            ghosts[i].setY(4*blocksize);
            ghosts[i].setDy(0);
            ghosts[i].setDx(dx);
            dx =-dx;
            random = (int) (Math.random() * (currentspeed +1));
            if(random > currentspeed)
                random = currentspeed;

            Pacman p = new Pacman();
            p.setX(7*blocksize);
            p.setY(11*blocksize);
            p.setDx(0);
            p.setDy(0);
            dirdx=0;
            dirdy=0;
            viewdx=-1;
            viewdy=0;
            dying = false;
        }
    }


}
