package ENUM_ClothesSizes;

public enum ClothesSizes {
    XXS (32){
        @Override
        public String getDescription () {
            return "детский размер";
        }
    },XS(34),S(36),M(38),L(40);

    private final int euroSize;

    ClothesSizes(int euroSize) {
        this.euroSize = euroSize;
    }

    public String getDescription () {
        return "взрослый размер";
    }


}
