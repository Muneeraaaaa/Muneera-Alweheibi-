public class ball {
        float x;
        float y;
        int redius;
        float xDelta;
        float yDelta;


        public ball(float x, float y, int redius, float xDelta, float yDelta) {
            this.x = x;
            this.y = y;
            this.redius = redius;
            this.xDelta = xDelta;
            this.yDelta = yDelta;
        }

        public float getX() {
            return x;
        }

        public void setX(float x) {
            this.x = x;
        }

        public float getY() {
            return y;
        }

        public void setY(float y) {
            this.y = y;
        }

        public int getRedius() {
            return redius;
        }

        public void setRedius(int redius) {
            this.redius = redius;
        }

        public float getxDelta() {
            return xDelta;
        }

        public void setxDelta(float xDelta) {
            this.xDelta = xDelta;
        }

        public float getyDelta() {
            return yDelta;
        }

        public void setyDelta(float yDelta) {
            this.yDelta = yDelta;
        }

        public void move(){
            x+=xDelta;
            y+=yDelta;
        }

        public void reflectHorizontal(){
            xDelta=-xDelta;
        }

        public void reflectVertical(){
            yDelta=-yDelta;
        }

        @Override
        public String toString() {
            return "Ball[("+x +
                    "," + y +
                    "),speed=(" + xDelta +
                    ", " + yDelta +
                    ")]";
        }

}
