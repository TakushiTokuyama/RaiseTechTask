package com.example.demo.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.domain.Business;
import com.example.demo.domain.Week;
import com.example.demo.mapper.BusinessMapper;

@Controller
public class BusinessController {

	@Autowired
	BusinessMapper businessMapper;

	@RequestMapping(value = "/business/manage_form", method = RequestMethod.GET)
	public ModelAndView namage_form(@ModelAttribute("formModel") Business business, ModelAndView mav) {
		mav.setViewName("/business/manage_form");

		return mav;

	}

	@RequestMapping(value = "/business/manage_form", method = RequestMethod.POST)
	@Transactional(readOnly = false)
	public ModelAndView formResult(HttpServletRequest request,
			@ModelAttribute("formModel") @Validated Business business,
			BindingResult result,
			ModelAndView mav) {

		if (!result.hasErrors()) {
			businessMapper.save(business);

			return new ModelAndView("redirect:/business/manage");
		}
		mav.setViewName("/business/manage_form");
		return mav;
	}

	@RequestMapping(value = "/business/manage", method = RequestMethod.GET)
	public ModelAndView manage(HttpServletRequest request, ModelAndView mav) {
		mav.setViewName("business/manage");

		//日付をyyyyMMDDに変更
		LocalDate l = LocalDate.now();
		DateTimeFormatter d = DateTimeFormatter.ofPattern("yyyy年MM月");
		String selectedCalender = l.format(d);

		mav.addObject("selectedCalender", selectedCalender);

		//1-12月
		ArrayList<Integer> month = new ArrayList<>();

		for (int i = 1; i <= 12; i++) {
			month.add(i);
		}

		mav.addObject("month", month);

		//2019-2030年まで
		ArrayList<Integer> year = new ArrayList<>();

		for (int i = 2019; i <= 2030; i++) {
			year.add(i);
		}

		mav.addObject("year", year);

		//10月の合計日数
		int totalDay = LocalDate.of(2019, 10, 1).lengthOfMonth();

		//今日の日付
		LocalDateTime today = LocalDateTime.now();
		mav.addObject("today", today);

		//10月の最初の曜日の日付 日曜1-土曜日7
		Calendar cal = Calendar.getInstance();
		cal.set(2019, 10 - 1, 1);
		int weekIndex = cal.get(Calendar.DAY_OF_WEEK);
		mav.addObject("weekIndex", weekIndex);

		ArrayList<Week> calenderDay = new ArrayList<>();
		Week week = new Week();
		int weekDay = 0;

		//日曜日が最初のカレンダー 10月は火曜からなのでweekDay+2
		if (weekIndex == 2) {
			weekDay += 1;
		}
		if (weekIndex == 3) {
			weekDay += 2;
		}
		if (weekIndex == 4) {
			weekDay += 3;
		}
		if (weekIndex == 5) {
			weekDay += 4;
		}
		if (weekIndex == 6) {
			weekDay += 5;
		}
		if (weekIndex == 7) {
			weekDay += 6;
		}
		//日付をカレンダーに表示
		for (int i = 1; i <= totalDay; i++) {

			week.setMonthDay(weekDay, i);
			weekDay++;

		}

		calenderDay.add(week);

		mav.addObject("october", calenderDay);

		//1日分のtitle格納
		ArrayList<Business> titleListOne = new ArrayList<>();
		ArrayList<Business> titleListTwo = new ArrayList<>();
		ArrayList<Business> titleListThree = new ArrayList<>();
		ArrayList<Business> titleListFour = new ArrayList<>();
		ArrayList<Business> titleListFive = new ArrayList<>();
		ArrayList<Business> titleListSix = new ArrayList<>();
		ArrayList<Business> titleListSeven = new ArrayList<>();
		ArrayList<Business> titleListEight = new ArrayList<>();
		ArrayList<Business> titleListNine = new ArrayList<>();
		ArrayList<Business> titleListTen = new ArrayList<>();

		ArrayList<Business> titleListEleven = new ArrayList<>();
		ArrayList<Business> titleListTwelve = new ArrayList<>();
		ArrayList<Business> titleListThirteen = new ArrayList<>();
		ArrayList<Business> titleListFourteen = new ArrayList<>();
		ArrayList<Business> titleListFifteen = new ArrayList<>();
		ArrayList<Business> titleListSixteen = new ArrayList<>();
		ArrayList<Business> titleListSeventeen = new ArrayList<>();
		ArrayList<Business> titleListEighteen = new ArrayList<>();
		ArrayList<Business> titleListNineteen = new ArrayList<>();
		ArrayList<Business> titleListTwenty = new ArrayList<>();

		ArrayList<Business> titleListTwentyOne = new ArrayList<>();
		ArrayList<Business> titleListTwentyTwo = new ArrayList<>();
		ArrayList<Business> titleListTwentyThree = new ArrayList<>();
		ArrayList<Business> titleListTwentyFour = new ArrayList<>();
		ArrayList<Business> titleListTwentyFive = new ArrayList<>();
		ArrayList<Business> titleListTwentySix = new ArrayList<>();
		ArrayList<Business> titleListTwentySeven = new ArrayList<>();
		ArrayList<Business> titleListTwentyEight = new ArrayList<>();
		ArrayList<Business> titleListTwentyNine = new ArrayList<>();

		ArrayList<Business> titleListThirty = new ArrayList<>();
		ArrayList<Business> titleListThirtyOne = new ArrayList<>();

		//31日分のtitle格納
		List<ArrayList<Business>> titleLists = new ArrayList<ArrayList<Business>>();

		for (int day = 1, a = 0; day <= totalDay; day++) {

			//日付をyyyyMMDDに変更
			LocalDate c = LocalDate.of(2019, 10, day);
			DateTimeFormatter d1 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			String manageDay = c.format(d1);
			//最初の週
			while (a < 1) {
				for (int i = 0; i < weekIndex - 1; i++) {
					titleLists.add(new ArrayList<Business>());
					a++;
				}
				a++;
			}

			switch (day) {
			case 1:
				titleListOne.addAll(businessMapper.findTitle(manageDay));
				titleLists.add(titleListOne);
				break;
			case 2:
				titleListTwo.addAll(businessMapper.findTitle(manageDay));
				titleLists.add(titleListTwo);
				break;
			case 3:
				titleListThree.addAll(businessMapper.findTitle(manageDay));
				titleLists.add(titleListThree);
				break;
			case 4:
				titleListFour.addAll(businessMapper.findTitle(manageDay));
				titleLists.add(titleListFour);
				break;
			case 5:
				titleListFive.addAll(businessMapper.findTitle(manageDay));
				titleLists.add(titleListFive);
				break;
			case 6:
				titleListSix.addAll(businessMapper.findTitle(manageDay));
				titleLists.add(titleListSix);
				break;
			case 7:
				titleListSeven.addAll(businessMapper.findTitle(manageDay));
				titleLists.add(titleListSeven);
				break;
			case 8:
				titleListEight.addAll(businessMapper.findTitle(manageDay));
				titleLists.add(titleListEight);
				break;

			case 9:
				titleListNine.addAll(businessMapper.findTitle(manageDay));
				titleLists.add(titleListNine);
				break;
			case 10:
				titleListTen.addAll(businessMapper.findTitle(manageDay));
				titleLists.add(titleListTen);
				break;
			case 11:
				titleListEleven.addAll(businessMapper.findTitle(manageDay));
				titleLists.add(titleListEleven);
				break;
			case 12:
				titleListTwelve.addAll(businessMapper.findTitle(manageDay));
				titleLists.add(titleListTwelve);
				break;
			case 13:
				titleListThirteen.addAll(businessMapper.findTitle(manageDay));
				titleLists.add(titleListThirteen);
				break;
			case 14:
				titleListFourteen.addAll(businessMapper.findTitle(manageDay));
				titleLists.add(titleListFourteen);
				break;
			case 15:
				titleListFifteen.addAll(businessMapper.findTitle(manageDay));
				titleLists.add(titleListFifteen);
				break;
			case 16:
				titleListSixteen.addAll(businessMapper.findTitle(manageDay));
				titleLists.add(titleListSixteen);
				break;
			case 17:
				titleListSeventeen.addAll(businessMapper.findTitle(manageDay));
				titleLists.add(titleListSeventeen);
				break;
			case 18:
				titleListEighteen.addAll(businessMapper.findTitle(manageDay));
				titleLists.add(titleListEighteen);
				break;
			case 19:
				titleListNineteen.addAll(businessMapper.findTitle(manageDay));
				titleLists.add(titleListNineteen);
				break;
			case 20:
				titleListTwenty.addAll(businessMapper.findTitle(manageDay));
				titleLists.add(titleListTwenty);
				break;
			case 21:
				titleListTwentyOne.addAll(businessMapper.findTitle(manageDay));
				titleLists.add(titleListTwentyOne);
				break;
			case 22:
				titleListTwentyTwo.addAll(businessMapper.findTitle(manageDay));
				titleLists.add(titleListTwentyTwo);
				break;
			case 23:
				titleListTwentyThree.addAll(businessMapper.findTitle(manageDay));
				titleLists.add(titleListTwentyThree);
				break;
			case 24:
				titleListTwentyFour.addAll(businessMapper.findTitle(manageDay));
				titleLists.add(titleListTwentyFour);
				break;
			case 25:
				titleListTwentyFive.addAll(businessMapper.findTitle(manageDay));
				titleLists.add(titleListTwentyFive);
				break;
			case 26:
				titleListTwentySix.addAll(businessMapper.findTitle(manageDay));
				titleLists.add(titleListTwentySix);
				break;
			case 27:
				titleListTwentySeven.addAll(businessMapper.findTitle(manageDay));
				titleLists.add(titleListTwentySeven);
				break;
			case 28:
				titleListTwentyEight.addAll(businessMapper.findTitle(manageDay));
				titleLists.add(titleListEight);
				break;
			case 29:
				titleListTwentyNine.addAll(businessMapper.findTitle(manageDay));
				titleLists.add(titleListTwentyNine);
				break;
			case 30:
				titleListThirty.addAll(businessMapper.findTitle(manageDay));
				titleLists.add(titleListThirty);
				break;
			case 31:
				titleListThirtyOne.addAll(businessMapper.findTitle(manageDay));
				titleLists.add(titleListThirtyOne);
				break;

			default:
			}

		}
		//最後の週
		for (int i = 0; i + weekIndex + totalDay <= 42; i++) {
			titleLists.add(new ArrayList<Business>());
		}

		mav.addObject("titleLists", titleLists);

		return mav;
	}

	@RequestMapping(value = "/business/manage", method = RequestMethod.POST)
	public ModelAndView calenderView(HttpServletRequest request, ModelAndView mav) {

		int selectedYear = Integer.parseInt(request.getParameter("selectedYear"));
		int selectedMonth = Integer.parseInt(request.getParameter("selectedMonth"));

		//今日の日付
		LocalDateTime today = LocalDateTime.now();
		mav.addObject("today", today);

		//1-12月
		ArrayList<Integer> month = new ArrayList<>();

		for (int i = 1; i <= 12; i++) {
			month.add(i);
		}

		mav.addObject("month", month);

		//2019-2030年まで
		ArrayList<Integer> year = new ArrayList<>();

		for (int i = 2019; i <= 2030; i++) {
			year.add(i);
		}

		mav.addObject("year", year);

		//selectedYear年selectedMonth月の合計日数
		int totalDay = LocalDate.of(selectedYear, selectedMonth, 1).lengthOfMonth();

		//selectedMonth月の最初の曜日の日付 日曜1-土曜日7
		Calendar cal = Calendar.getInstance();
		cal.set(selectedYear, selectedMonth - 1, 1);
		int weekIndex = cal.get(Calendar.DAY_OF_WEEK);
		mav.addObject("weekIndex", weekIndex);

		ArrayList<Week> calenderDay = new ArrayList<>();
		Week week = new Week();
		int weekDay = 0;

		//日曜日が最初のカレンダー 10月は火曜からなのでweekDay+2
		if (weekIndex == 2) {
			weekDay += 1;
		}
		if (weekIndex == 3) {
			weekDay += 2;
		}
		if (weekIndex == 4) {
			weekDay += 3;
		}
		if (weekIndex == 5) {
			weekDay += 4;
		}
		if (weekIndex == 6) {
			weekDay += 5;
		}
		if (weekIndex == 7) {
			weekDay += 6;
		}
		//日付をカレンダーに表示
		for (int i = 1; i <= totalDay; i++) {

			week.setMonthDay(weekDay, i);
			weekDay++;

		}

		calenderDay.add(week);

		mav.addObject("october", calenderDay);
		mav.addObject("weekIndex", weekIndex);

		//予定listをカレンダーに表示
		ArrayList<Business> titleListOne = new ArrayList<>();
		ArrayList<Business> titleListTwo = new ArrayList<>();
		ArrayList<Business> titleListThree = new ArrayList<>();
		ArrayList<Business> titleListFour = new ArrayList<>();
		ArrayList<Business> titleListFive = new ArrayList<>();
		ArrayList<Business> titleListSix = new ArrayList<>();
		ArrayList<Business> titleListSeven = new ArrayList<>();
		ArrayList<Business> titleListEight = new ArrayList<>();
		ArrayList<Business> titleListNine = new ArrayList<>();
		ArrayList<Business> titleListTen = new ArrayList<>();

		ArrayList<Business> titleListEleven = new ArrayList<>();
		ArrayList<Business> titleListTwelve = new ArrayList<>();
		ArrayList<Business> titleListThirteen = new ArrayList<>();
		ArrayList<Business> titleListFourteen = new ArrayList<>();
		ArrayList<Business> titleListFifteen = new ArrayList<>();
		ArrayList<Business> titleListSixteen = new ArrayList<>();
		ArrayList<Business> titleListSeventeen = new ArrayList<>();
		ArrayList<Business> titleListEighteen = new ArrayList<>();
		ArrayList<Business> titleListNineteen = new ArrayList<>();
		ArrayList<Business> titleListTwenty = new ArrayList<>();

		ArrayList<Business> titleListTwentyOne = new ArrayList<>();
		ArrayList<Business> titleListTwentyTwo = new ArrayList<>();
		ArrayList<Business> titleListTwentyThree = new ArrayList<>();
		ArrayList<Business> titleListTwentyFour = new ArrayList<>();
		ArrayList<Business> titleListTwentyFive = new ArrayList<>();
		ArrayList<Business> titleListTwentySix = new ArrayList<>();
		ArrayList<Business> titleListTwentySeven = new ArrayList<>();
		ArrayList<Business> titleListTwentyEight = new ArrayList<>();
		ArrayList<Business> titleListTwentyNine = new ArrayList<>();

		ArrayList<Business> titleListThirty = new ArrayList<>();
		ArrayList<Business> titleListThirtyOne = new ArrayList<>();

		List<ArrayList<Business>> titleLists = new ArrayList<ArrayList<Business>>();

		for (int day = 1, a = 0; day <= totalDay; day++) {

			//日付をyyyyMMDDに変更
			LocalDate c = LocalDate.of(selectedYear, selectedMonth, day);
			DateTimeFormatter d = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			String manageDay = c.format(d);
			//最初の週
			while (a < 1) {
				for (int i = 0; i < weekIndex - 1; i++) {
					titleLists.add(new ArrayList<Business>());
					a++;
				}
				a++;
			}

			switch (day) {
			case 1:
				titleListOne.addAll(businessMapper.findTitle(manageDay));
				titleLists.add(titleListOne);
				break;
			case 2:
				titleListTwo.addAll(businessMapper.findTitle(manageDay));
				titleLists.add(titleListTwo);
				break;
			case 3:
				titleListThree.addAll(businessMapper.findTitle(manageDay));
				titleLists.add(titleListThree);
				break;
			case 4:
				titleListFour.addAll(businessMapper.findTitle(manageDay));
				titleLists.add(titleListFour);
				break;
			case 5:
				titleListFive.addAll(businessMapper.findTitle(manageDay));
				titleLists.add(titleListFive);
				break;
			case 6:
				titleListSix.addAll(businessMapper.findTitle(manageDay));
				titleLists.add(titleListSix);
				break;
			case 7:
				titleListSeven.addAll(businessMapper.findTitle(manageDay));
				titleLists.add(titleListSeven);
				break;
			case 8:
				titleListEight.addAll(businessMapper.findTitle(manageDay));
				titleLists.add(titleListEight);
				break;
			case 9:
				titleListNine.addAll(businessMapper.findTitle(manageDay));
				titleLists.add(titleListNine);
				break;
			case 10:
				titleListTen.addAll(businessMapper.findTitle(manageDay));
				titleLists.add(titleListTen);
				break;
			case 11:
				titleListEleven.addAll(businessMapper.findTitle(manageDay));
				titleLists.add(titleListEleven);
				break;
			case 12:
				titleListTwelve.addAll(businessMapper.findTitle(manageDay));
				titleLists.add(titleListTwelve);
				break;
			case 13:
				titleListThirteen.addAll(businessMapper.findTitle(manageDay));
				titleLists.add(titleListThirteen);
				break;
			case 14:
				titleListFourteen.addAll(businessMapper.findTitle(manageDay));
				titleLists.add(titleListFourteen);
				break;
			case 15:
				titleListFifteen.addAll(businessMapper.findTitle(manageDay));
				titleLists.add(titleListFifteen);
				break;
			case 16:
				titleListSixteen.addAll(businessMapper.findTitle(manageDay));
				titleLists.add(titleListSixteen);
				break;
			case 17:
				titleListSeventeen.addAll(businessMapper.findTitle(manageDay));
				titleLists.add(titleListSeventeen);
				break;
			case 18:
				titleListEighteen.addAll(businessMapper.findTitle(manageDay));
				titleLists.add(titleListEighteen);
				break;
			case 19:
				titleListNineteen.addAll(businessMapper.findTitle(manageDay));
				titleLists.add(titleListNineteen);
				break;
			case 20:
				titleListTwenty.addAll(businessMapper.findTitle(manageDay));
				titleLists.add(titleListTwenty);
				break;
			case 21:
				titleListTwentyOne.addAll(businessMapper.findTitle(manageDay));
				titleLists.add(titleListTwentyOne);
				break;
			case 22:
				titleListTwentyTwo.addAll(businessMapper.findTitle(manageDay));
				titleLists.add(titleListTwentyTwo);
				break;
			case 23:
				titleListTwentyThree.addAll(businessMapper.findTitle(manageDay));
				titleLists.add(titleListTwentyThree);
				break;
			case 24:
				titleListTwentyFour.addAll(businessMapper.findTitle(manageDay));
				titleLists.add(titleListTwentyFour);
				break;
			case 25:
				titleListTwentyFive.addAll(businessMapper.findTitle(manageDay));
				titleLists.add(titleListTwentyFive);
				break;
			case 26:
				titleListTwentySix.addAll(businessMapper.findTitle(manageDay));
				titleLists.add(titleListTwentySix);
				break;
			case 27:
				titleListTwentySeven.addAll(businessMapper.findTitle(manageDay));
				titleLists.add(titleListTwentySeven);
				break;
			case 28:
				titleListTwentyEight.addAll(businessMapper.findTitle(manageDay));
				titleLists.add(titleListEight);
				break;
			case 29:
				titleListTwentyNine.addAll(businessMapper.findTitle(manageDay));
				titleLists.add(titleListTwentyNine);
				break;
			case 30:
				titleListThirty.addAll(businessMapper.findTitle(manageDay));
				titleLists.add(titleListThirty);
				break;
			case 31:
				titleListThirtyOne.addAll(businessMapper.findTitle(manageDay));
				titleLists.add(titleListThirtyOne);
				break;

			default:
			}
		}
		//最後の週
		for (int i = 0; i + weekIndex + totalDay <= 42; i++) {
			titleLists.add(new ArrayList<Business>());
		}

		mav.addObject("titleLists", titleLists);

		//日付をyyyyMMDDに変更
		LocalDate l = LocalDate.of(selectedYear, selectedMonth, 1);
		DateTimeFormatter d = DateTimeFormatter.ofPattern("yyyy年MM月");
		String selectedCalender = l.format(d);

		mav.addObject("selectedCalender", selectedCalender);

		//int id = Integer.parseInt(request.getParameter("id"));
		//if(31 < id && id < 0 ) {
		//	mav.addObject("msg", "1-31を入力してください");
		//	return mav;
		//}else {
		//	List<Business> business = businessMapper.findOne(id);
		//	mav.addObject("manageDay",business);
		//}
		return mav;
	}

	@RequestMapping(value = "/business/manage_details/{id}", method = RequestMethod.GET)
	public ModelAndView manage_details(@ModelAttribute Business business, @PathVariable int id,
			ModelAndView mav) {
		mav.setViewName("/business/manage_details");
		Optional<Business> eventDetails = businessMapper.findId(id);
		mav.addObject("eventDetails", eventDetails.get());
		return mav;
	}

	@RequestMapping(value = "/business/manage_details_edit/{id}", method = RequestMethod.GET)
	public ModelAndView manage_details_editView(@ModelAttribute Business business, @PathVariable int id,
			ModelAndView mav) {
		mav.setViewName("/business/manage_details_edit");
		Optional<Business> eventDetails = businessMapper.findId(id);
		mav.addObject("eventDetails", eventDetails);
		return mav;

	}

	@RequestMapping(value = "/business/manage_details_edit" , method =RequestMethod.POST)
	@Transactional(readOnly = false)
	public ModelAndView manage_details_edit(@ModelAttribute("eventDetails") Business business,
			ModelAndView mav) {

		businessMapper.update(business);

		return new ModelAndView("redirect:/business/manage");
	}

	@RequestMapping(value = "/business/manage_details_delete/{id}", method = RequestMethod.GET)
	public ModelAndView manage_details_deleteView(@ModelAttribute Business business, @PathVariable int id,
			ModelAndView mav) {
		mav.setViewName("/business/manage_details_delete");
		Optional<Business> eventDetails = businessMapper.findId(id);
		mav.addObject("eventDetails", eventDetails.get());
		return mav;
	}

	@RequestMapping(value="/business/manage_details_delete" , method = RequestMethod.POST)
	public ModelAndView manage_details_delete(@RequestParam int id) {

		businessMapper.delete(id);

		return new ModelAndView("redirect:/business/manage");
	}


}
