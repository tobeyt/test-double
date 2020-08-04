package stub;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.stubbing.OngoingStubbing;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class GradeServiceTest {
    /* 需求描述：
    编写GradeService类的单元测试，单元测试calculateAverageGrades方法
    * */
    @InjectMocks
    private GradeService mockGradeService;
    @Mock
    private GradeSystem gradeSystem;

    @Test
    public void shouldReturn90WhenCalculateStudentAverageGradeAndGradeIs80And90And100() {
        when(gradeSystem.gradesFor(123)).thenReturn(Arrays.asList(90.0, 95.0, 100.0));
        Assertions.assertEquals(95.0, mockGradeService.calculateAverageGrades(123));
        verify(gradeSystem).gradesFor(123);
    }
}