package main.controllers.view;

import main.dao.services.RoomService;
import main.dao.services.UserService;
import main.entity.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.List;

@Controller
public class RoomViewController {
    @Autowired
    private RoomService roomService;
    @Autowired
    private UserService userService;

    @GetMapping("/all-rooms")
    public String getAllRooms(ModelMap model) {
        model.addAttribute("rooms", roomService.findAll());
        return "rooms";
    }

    @GetMapping("/rooms-by-user-id/{id}")
    public String getRoomsByUserId(ModelMap model, @PathVariable Long id) {
        model.addAttribute("rooms", roomService.findRoomsByUserId(id));
        return "category-rooms";
    }

    @GetMapping("/rooms-by-category/{category}")
    public String getRoomsByCategory(ModelMap model, @PathVariable String category) {
        model.addAttribute("rooms", roomService.findRoomsByCategory(category));
        return "category-rooms";
    }

    @GetMapping("/select-rooms-category")
    public String getRoomsCategory() {
        return "select-rooms-category";
    }

    @GetMapping("/new-room")
    public String newRoom(ModelMap modelMap) {
        modelMap.addAttribute("room", new Room());
        return "create_room";
    }

    @PostMapping("/new-room")
    public String newRoom(Room room) {
        roomService.saveRoom(room);
        return "redirect:/all-rooms";
    }

    @GetMapping("/delete-room/{id}")
    public String deleteRoom(@PathVariable long id) {
        roomService.deleteRoomById(id);
        return "redirect:/all-rooms";
    }

    @GetMapping("/free-rooms-for-date")
    public String getFreeRoomsForDate() {
        return "free-rooms-for";
    }

    @GetMapping("/free-rooms-for/{date}")
    public String getFreeRoomsForDate(ModelMap model, @PathVariable String date) {
        List<Room> freeRoomsForDate = roomService.findFreeRoomsForDate(date);
        model.addAttribute("freeRooms", freeRoomsForDate);
        return "free-rooms";
    }
}





