package com.sg.itemmanager.dto;

import static com.sg.itemmanager.dto.Item.Genre.ACTION;
import static com.sg.itemmanager.dto.Item.Genre.ADVENTURE;
import static com.sg.itemmanager.dto.Item.Genre.HORROR;
import static com.sg.itemmanager.dto.Item.Genre.INDIE;
import static com.sg.itemmanager.dto.Item.Genre.PLATFORMER;
import static com.sg.itemmanager.dto.Item.Genre.RACING;
import static com.sg.itemmanager.dto.Item.Genre.SHOOTER;
import static com.sg.itemmanager.dto.Item.System.DS;
import static com.sg.itemmanager.dto.Item.System.GAMECUBE;
import static com.sg.itemmanager.dto.Item.System.GAMEBOY;
import static com.sg.itemmanager.dto.Item.System.PS2;
import static com.sg.itemmanager.dto.Item.System.PS3;
import static com.sg.itemmanager.dto.Item.System.PS4;
import static com.sg.itemmanager.dto.Item.System.SWITCH;
import static com.sg.itemmanager.dto.Item.System.WII;
import static com.sg.itemmanager.dto.Item.System.WIIU;
import static com.sg.itemmanager.dto.Item.System.XBOX;
import static com.sg.itemmanager.dto.Item.System.XBOX360;
import static com.sg.itemmanager.dto.Item.System.XBOXONE;
import java.time.LocalDate;

public class Item {
    
    private String title;
    private Genre genre;
    private System system;
    private LocalDate releaseDate;
    
    public Item(String title) {
        this.title = title;
    }
    
    public void setRealeaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }
    
    public void setGenre(String input) {
        
        String checker = input.toLowerCase();
        
        switch(checker) {
            case "horror":
                this.genre = genres(HORROR);
                break;
            case "action":
                this.genre = genres(ACTION);
                break;
            case "adventure":
                this.genre = genres(ADVENTURE);
                break;
            case "platformer":
                this.genre = genres(PLATFORMER);
                break;
            case "shooter":
                this.genre = genres(SHOOTER);
                break;
            case "indie":
                this.genre = genres(SHOOTER);
                break;
            case "racing":
                this.genre = genres(RACING);
                break;
            default:
                throw new UnsupportedOperationException();
        }
    }
    
    public void setSystem(String input) {
        
        String checker = input.toLowerCase();
        
        switch(checker) {
            case "xbox":
                this.system = systems(XBOX);
                break;
            case "xbox360":
                this.system = systems(XBOX360   );
                break;
            case "xboxone":
                this.system = systems(XBOXONE);
                break;
            case "ps2":
                this.system = systems(PS2);
                break;
            case "ps3":
                this.system = systems(PS3);
                break;
            case "ps4":
                this.system = systems(PS4);
                break;
            case "gameboy":
                this.system = systems(GAMEBOY);
                break;
            case "ds":
                this.system = systems(DS);
                break;
            case "gamecube":
                this.system = systems(GAMECUBE);
                break;
            case "wii":
                this.system = systems(WII);
                break;
            case "wiiu":
                this.system = systems(WIIU);
                break;
            case "switch":
                this.system = systems(SWITCH);
                break;
            default:
                throw new UnsupportedOperationException();
        }
    }
    
    public Genre genres(Genre operator) {
        
        switch(operator) {
            case HORROR:
                return HORROR;
            case ACTION:
                return ACTION;
            case ADVENTURE:
                return ADVENTURE;
            case PLATFORMER:
                return PLATFORMER;
            case SHOOTER:
                return SHOOTER;
            case INDIE:
                return INDIE;
            case RACING:
                return RACING;
            default:
                throw new UnsupportedOperationException();
        }
    }
    
    public System systems(System operator) {
        
        switch(operator) {
            case XBOX:
                return XBOX;
            case XBOX360:
                return XBOX360;
            case XBOXONE:
                return XBOXONE;
            case PS2:
                return PS2;
            case PS3:
                return PS3;
            case PS4:
                return PS4;
            case GAMEBOY:
                return GAMEBOY;
            case DS:
                return DS;
            case GAMECUBE:
                return GAMECUBE;
            case WII:
                return WII;
            case WIIU:
                return WIIU;
            case SWITCH:
                return SWITCH;
            default:
                throw new UnsupportedOperationException();
        }
    }
    
    public String getTitle() {
        return title;
    }
    
    public Genre getGenre() {
        return genre;
    }
    
    public System getSystem() {
        return system;
    }
    
    public LocalDate getreleaseDate() {
        return releaseDate;
    }
    
    public enum System {
        XBOX, XBOX360, XBOXONE, PS2, PS3, PS4, GAMEBOY, DS, 
                GAMECUBE, WII, WIIU, SWITCH;
    }
    
    public enum Genre {
        HORROR, ACTION, ADVENTURE, PLATFORMER, SHOOTER, INDIE, RACING;
    }  
}


