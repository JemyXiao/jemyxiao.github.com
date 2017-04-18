package tk.mybatis.springboot.model;
//import javax.persistence.Entity;
//import javax.persistence.Table;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by chenjie on 15/12/31.
 */
@Entity
@Table(name = "t_tar_business")
public class Business {
    @Id
    private String id;

    private long restaurant_id;

    private String restaurant_name;

    private int city_id;

    private String city_name;

    private String zone;
    //战营
    private String war_camp;

    private String business_war;

    private String main_tag;

    private String valid_date;

    private String check_man;
    //抽样人
    private String sample_man;

    private String bushiness_packaged_man;

    private String target_id;

    private Integer is_modify;

    private Integer is_valid;

    private String target_birth_time;

    private Integer favor_id;

    public String getSample_man() {
        return sample_man;
    }

    public void setSample_man(String sample_man) {
        this.sample_man = sample_man;
    }

    public String getWar_camp() {
        return war_camp;
    }

    public void setWar_camp(String war_camp) {
        this.war_camp = war_camp;
    }

    public String getBushiness_packaged_man() {
        return bushiness_packaged_man;
    }

    public void setBushiness_packaged_man(String bushiness_packaged_man) {
        this.bushiness_packaged_man = bushiness_packaged_man;
    }

    public int getCity_id() {
        return city_id;
    }

    public void setCity_id(int city_id) {
        this.city_id = city_id;
    }

    public long getRestaurant_id() {
        return restaurant_id;
    }

    public void setRestaurant_id(long restaurant_id) {
        this.restaurant_id = restaurant_id;
    }

    public String getRestaurant_name() {
        return restaurant_name;
    }

    public void setRestaurant_name(String restaurant_name) {
        this.restaurant_name = restaurant_name;
    }

    public String getCity_name() {
        return city_name;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public String getBusiness_war() {
        return business_war;
    }

    public void setBusiness_war(String business_war) {
        this.business_war = business_war;
    }

    public String getMain_tag() {
        return main_tag;
    }

    public void setMain_tag(String main_tag) {
        this.main_tag = main_tag;
    }

    public String getValid_date() {
        return valid_date;
    }

    public void setValid_date(String valid_date) {
        this.valid_date = valid_date;
    }

    public String getCheck_man() {
        return check_man;
    }

    public void setCheck_man(String check_man) {
        this.check_man = check_man;
    }


    public String getTarget_id() {
        return target_id;
    }

    public void setTarget_id(String target_id) {
        this.target_id = target_id;
    }

    public Integer getIs_modify() {
        return is_modify;
    }

    public void setIs_modify(Integer is_modify) {
        this.is_modify = is_modify;
    }

    public Integer getIs_valid() {
        return is_valid;
    }

    public void setIs_valid(Integer is_valid) {
        this.is_valid = is_valid;
    }

    public String getTarget_birth_time() {
        return target_birth_time;
    }

    public void setTarget_birth_time(String target_birth_time) {
        this.target_birth_time = target_birth_time;
    }

    public Integer getFavor_id() {
        return favor_id;
    }

    public void setFavor_id(Integer favor_id) {
        this.favor_id = favor_id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Business{" +
                "restaurant_id=" + restaurant_id +
                ", restaurant_name='" + restaurant_name + '\'' +
                ", city_id=" + city_id +
                ", city_name='" + city_name + '\'' +
                ", zone='" + zone + '\'' +
                ", business_war='" + business_war + '\'' +
                ", main_tag='" + main_tag + '\'' +
                ", valid_date='" + valid_date + '\'' +
                ", check_man='" + check_man + '\'' +
                ", bushiness_packaged_man='" + bushiness_packaged_man + '\'' +
                ", target_id='" + target_id + '\'' +
                ", is_modify=" + is_modify +
                ", is_valid=" + is_valid +
                ", target_birth_time='" + target_birth_time + '\'' +
                ", favor_id=" + favor_id +
                '}';
    }

}



