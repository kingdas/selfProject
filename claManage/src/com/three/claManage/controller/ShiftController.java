package com.three.claManage.controller;

import java.util.List;
import java.util.concurrent.Delayed;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.three.claManage.model.SysWorkShift;
import com.three.claManage.service.ShiftService;

@Controller
@RequestMapping("shift")
public class ShiftController {
	@Autowired
	ShiftService shiftService;

	@RequestMapping("add")
	public String add() {
		return "shiftAdd";
	}

	@RequestMapping(value = "doAdd", method = RequestMethod.POST)
	public String doAdd(SysWorkShift sws) {
		shiftService.add(sws);
		return "redirect:/shift/list";
	}

	@RequestMapping("update/{shiftId}")
	public String Update(@PathVariable int shiftId, Model m) {
		SysWorkShift sws = shiftService.findById(shiftId);
		m.addAttribute("swss", sws);
		return "shiftUpdate";
	}

	@RequestMapping(value = "doUpdate", method = RequestMethod.POST)
	public String doUpdate(SysWorkShift sws) {
		// int shiftId, String shiftName, String shiftStartTime, String shiftEndTime,
		// int shopId,
//		int linerId, int placeId
//		SysWorkShift sws = new SysWorkShift();
//		sws.setLinerId(linerId);
//		sws.setPlaceId(placeId);
//		sws.setShiftEndTime(shiftEndTime);
//		sws.setShiftId(shiftId);
//		sws.setShiftName(shiftName);
//		sws.setShiftStartTime(shiftStartTime);
//		sws.setShopId(shopId);
		shiftService.update(sws);
		return "redirect:/shift/list";
	}

	@RequestMapping("delete/{shiftId}")
	public String Delete(@PathVariable int shiftId) {
		shiftService.delete(shiftId);
		return "redirect:/shift/list";
	}

	@RequestMapping("search")
	public String findByCondition(Model m, SysWorkShift sws) {
		List<SysWorkShift> swss = shiftService.findByCondition(sws);
		m.addAttribute("swss", swss);
		return "shiftList";
	}

	@RequestMapping("list")
	public String findAll(Model m) {
		List<SysWorkShift> li = shiftService.findAll();
		m.addAttribute("swss", li);
		return "shiftList";
	}
}
