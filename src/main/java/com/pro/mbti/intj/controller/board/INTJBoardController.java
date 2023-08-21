package com.pro.mbti.intj.controller.board;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.pro.mbti.intj.domain.board.INTJBoardDTO;
import com.pro.mbti.intj.service.board.INTJBoardServiceImpl;
import com.pro.mbti.member.domain.MemberDTO;
import com.pro.mbti.member.domain.User;

@Controller
@RequestMapping("/intj")
public class INTJBoardController {
	@Autowired
	private INTJBoardServiceImpl INTJBoardService;
	
	//게시판 목록 조회
		@RequestMapping(value="/INTJBoard", method=RequestMethod.GET)
		public void getINTJList(Model model) {
			List<INTJBoardDTO> INTJList = INTJBoardService.selectINTJList();
			model.addAttribute("INTJList",INTJList);
		}

	
	//게시글 작성 -> GET방식 글작성폼으로 이동
		@RequestMapping(value = "/INTJWrite", method = RequestMethod.GET)
		public ModelAndView writeBoardForm(ModelAndView mv, HttpServletRequest request, HttpSession session) {
			session = request.getSession();
			User user = (User)session.getAttribute("AUTH_USER");
			if(user==null) {
				mv.setViewName("redirect:/member/login");
			} else {
				mv.addObject("user", user);
				mv.setViewName("/intj/INTJWrite");
			}
			
			return mv;
		}
	
	//게시글 작성 -> POST방식
	@RequestMapping(value = "/INTJWrite", method = RequestMethod.POST)
	public ModelAndView insertINTJWrite(HttpServletRequest request, INTJBoardDTO INTJboardDTO , ModelAndView mv) {
		INTJboardDTO.setMemberNick(request.getParameter("writerName"));
		INTJboardDTO.setINTJBoardTitle(request.getParameter("title"));
		INTJboardDTO.setINTJBoardDetail(request.getParameter("detail"));
		
		int result = INTJBoardService.insertINTJWrite(INTJboardDTO);
		if(result!=1) { 		
			mv.setViewName("redirect:/intj/INTJWrite");
		} else {		
			mv.setViewName("redirect:/intj/INTJBoard");
		} 
			return mv; 
	}
	
	
//	//파일첨부
//	@PostMapping("/uploadFile")
//	public String uploadFile(MultipartHttpServletRequest files) {
//		
//		
//		//서버에 저장할 경로 
//		String uploadFolder = "D:\\spring\\wk\\mbtiUploadFile";
//		List<MultipartFile> list = files.getFiles("filse");
//		for(int i = 0; i<list.size(); i++) {
//			String fileRealName = list.get(i).getOriginalFilename();
//			long size = list.get(i).getSize();
//			
//			System.out.println("파일명 :" + fileRealName);
//			System.out.println("사이즈 : " + size);
//			
//			String fileExtension = fileRealName.substring(fileRealName.lastIndexOf("."),fileRealName.length());
//			UUID uuid = UUID.randomUUID();
//			System.out.println(uuid.toString());
//			String[] uuids = uuid.toString().split("-");
//			
//			String uniqueName = uuids[0];
//			System.out.println("생성된 고유문자열" + uniqueName);
//			System.out.println("확장자명" + fileExtension);
//			
//			File saveFile = new File(uploadFolder + "\\" + fileRealName);
//			try {
//				list.get(i).transferTo(saveFile);
//			} catch (IllegalStateException e) {
//				e.printStackTrace();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
//	
//		return "redirect:/intj/INTJBoard";
//	}
	
	//게시글 상세보기
	@RequestMapping(value = "/read", method = RequestMethod.GET)
	public String read(INTJBoardDTO INTJboardDTO, Model model) {
		model.addAttribute("read", INTJBoardService.read(INTJboardDTO.getINTJBoardNo()));
		return "/intj/INTJDetail";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}