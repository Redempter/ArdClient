package haven;

public enum Action {
    TOGGLE_INVENTORY(GameUI::toggleInventory, "Inventory"),
    TOGGLE_EQUIPMENT(GameUI::toggleEquipment, "Equipment"),
    TOGGLE_CHARACTER(GameUI::toggleCharacter, "Character Sheet"),
    TOGGLE_KIN_LIST(GameUI::toggleKinList, "Kith & Kin"),
    TOGGLE_OPTIONS(GameUI::toggleOptions, "Options"),
    TOGGLE_CHAT(GameUI::toggleChat, "Toggle Chat"),
    TOGGLE_MAP(GameUI::toggleMap, "Toggle Map"),
    TAKE_SCREENSHOT(GameUI::takeScreenshot, "Take Screenshot"),
    CRAWL_SPEED(GameUI::crawlSpeed,"Crawling Speed"),
    WALK_SPEED(GameUI::walkSpeed,"Walking Speed"),
    RUN_SPEED(GameUI::runSpeed,"Run Speed"),
    SPRINT_SPEED(GameUI::sprintSpeed,"Sprinting Speed"),
    DRINK(GameUI::Drink,"Drinks from inventory or open belts."),
    ACT_HAND_0(GameUI::leftHand, "Left hand", "Left click on left hand slot."),
    ACT_HAND_1(GameUI::rightHand, "Right hand", "Left click on right hand slot."),
   // OPEN_QUICK_CRAFT(GameUI::toggleCraftList, "Open craft list", "Opens list of items you can craft. Start typing to narrow the list. Press Enter or double-click to select recipe."),
   // OPEN_QUICK_BUILD(GameUI::toggleBuildList, "Open building list", "Opens list of objects you can build. Start typing to narrow the list. Press Enter or double-click to select building."),
   // OPEN_QUICK_ACTION(GameUI::toggleActList, "Open actions list", "Opens list of actions you can perform. Start typing to narrow the list. Press Enter or double-click to perform action."),
  //  OPEN_CRAFT_DB(GameUI::toggleCraftDB, "Open crafting DB"),
    TOGGLE_CURSOR(GameUI::toggleHand, "Toggle cursor item", "Hide/show item on a cursor. Allows you to walk with item on cursor when hidden."),
    TOGGLE_STUDY(GameUI::toggleStudy, "Toggle study window"),
    TOGGLE_CAMERA(gui->gui.map.toggleCamera(),"Switches between camera views."),
 //  FILTER(gui -> gui.filter.toggle(), "Show item filter"),
    TOGGLE_GOB_INFO(GameUI::toggleTreeStage, "Display info", "Display crop/tree growth and object health overlay."),
    TOGGLE_GOB_HITBOX(GameUI::toggleGobs, "Display hitboxes"),
    TOGGLE_DANGER_RADIUS(GameUI::toggleDangerRadius, "Display danger radius", "Displays effective radius of animals/mine supports."),
    TOGGLE_SAFE_RADIUS(GameUI::toggleSafeRadius,"Displays Beehive/Trough Radius","Displays effective radius of beehives and troughs."),
    LOCAL_SCREENSHOT(GameUI::localScreenshot,"Take and save a local screenshot."),
    TOGGLE_TILE_GRID(gui -> gui.map.togglegrid(), "Show tile grid"),
    TOGGLE_TILE_CENTERING(GameUI::toggleGridCentering, "Toggle tile centering"),
    TOGGLE_DAYLIGHT(GameUI::toggleDaylight,"Toggles Nightvision"),
    TOGGLE_UI(GameUI::toggleUI,"Toggles the interface."),
    TOGGLE_STATUSOVERLAY(GameUI::toggleStatusWidget,"Toggles the players/ping display."),
    TOGGLE_HIDEGOBS(GameUI::toggleHide,"Toggles the hiding of objects on/off."),
    HARVEST_FORAGEABLE(GameUI::harvestForageable,"Harvest nearby forageable"),
    TOGGLE_PATHFINDING(GameUI::togglePathfinding,"Toggles pathfinding on/off."),
    TOGGLE_SEARCH(GameUI::toggleSearch,"Toggles the search menu"),
    AGGRO_CLOSEST(GameUI::aggroClosest,"Aggro closest player.");

    
    public final String name;
    private final Do action;
    public final String description;
    
    Action(Do action, String name, String description) {
	this.name = name;
	this.action = action;
	this.description = description;
    }
    
    Action(Do action, String name) {
	this(action, name, null);
    }
    
    public void run(GameUI gui) {
	action.run(gui);
    }
    
    interface Do {
	void run(GameUI gui);
    }
}