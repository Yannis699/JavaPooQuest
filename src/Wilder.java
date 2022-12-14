
    public class Wilder {

        private String firstname;
        private boolean isAware;

        public Wilder(String firstname) {
            this.firstname = firstname;
            this.isAware = true;
        }

        public String getFirstname() {
            return firstname;
        }

        public void setFirstname(String firstname) {
            this.firstname = firstname;
        }

        public boolean isAware() {
            return this.isAware;
        }

        public void setAware(boolean aware) {
            isAware = aware;
        }

        public String whoAmI() {
            if (this.isAware() == true) {
                return " je suis " + this.getFirstname() + " et je suis sacrément aware";
            } else {
                return " je suis " + this.getFirstname() + " et je ne suis pas aware";
            }
        }
    }

