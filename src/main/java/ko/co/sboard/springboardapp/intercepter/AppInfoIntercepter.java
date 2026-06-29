package ko.co.sboard.springboardapp.intercepter;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import ko.co.sboard.springboardapp.dto.AppInfoDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.lang.Nullable;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@RequiredArgsConstructor
public class AppInfoIntercepter implements HandlerInterceptor {
    private final AppInfoDTO appInfo;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // 컨트롤러 실행 전 호출

        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable ModelAndView modelAndView) throws Exception {
        // 컨트롤 실행 후 호출;
        if(modelAndView != null){
            // AppInfo
            modelAndView.addObject("appInfo", appInfo);
        }
    }
}
