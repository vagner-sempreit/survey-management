//package br.com.cielo.desafio.survey.service;
//
//import br.com.cielo.desafio.survey.BaseTest;
//import br.com.cielo.desafio.survey.fixture.PollFixture;
//import br.com.cielo.desafio.survey.fixture.PollRequestFixture;
//import br.com.cielo.desafio.survey.fixture.PollResponseFixture;
//import br.com.cielo.desafio.survey.model.Poll;
//import br.com.cielo.desafio.survey.repository.PollRepository;
//import br.com.cielo.desafio.survey.resource.request.PollRequest;
//import br.com.cielo.desafio.survey.resource.response.PollResponse;
//import org.junit.Before;
//import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
//import org.mockito.Mock;
//import org.springframework.stereotype.Service;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import java.util.Optional;
//
//import static br.com.six2six.fixturefactory.Fixture.from;
//import static org.junit.Assert.assertNotNull;
//import static org.junit.Assert.assertTrue;
//import static org.mockito.ArgumentMatchers.any;
//import static org.mockito.ArgumentMatchers.anyString;
//import static org.mockito.Mockito.verify;
//import static org.mockito.Mockito.when;
//
//
//@RunWith(SpringRunner.class)
//class PollServiceImplTest  extends BaseTest {
//
//	private static final Class<PollServiceImpl> CLAZZ = PollServiceImpl.class;
//
//	//@Autowired
//	//@InjectMocks
//	private PollServiceImpl service;
//
//	@Mock
//	private PollRepository pollRepository;
//
//	@Mock
//	private PersonService personService;
//
//	@Mock
//	private OptionService optionService;
//
//	private PollRequest pollRequest;
//
//	private Poll poll;
//
//	private PollResponse pollResponse;
//
//	@Test
//	public void testClassAnnotations() {
//		assertTrue(CLAZZ.isAnnotationPresent(Service.class));
//	}
//
//	@Before
//	public void setup() {
//		service = new PollServiceImpl(pollRepository, personService, optionService);
//		pollRequest = from(PollRequest.class).gimme(PollRequestFixture.POLL_REQUEST_OK);
//		poll = from(Poll.class).gimme(PollFixture.POLL_OK);
//		pollResponse = from(PollResponse.class).gimme(PollResponseFixture.POLL_RESPONSE_OK);
//	}
//
//	@Test
//	void testCreatePoll() {
//		when(pollRepository.findByTitle(anyString())).thenReturn(Optional.empty());
//		when(pollRepository.save(any())).thenReturn(poll);
//		var poll = service.createPoll(pollRequest);
//		verify(pollRepository).findByTitle(anyString());
//		verify(pollRepository).save(any());
//		assertNotNull(poll);
//	}
//
//}
